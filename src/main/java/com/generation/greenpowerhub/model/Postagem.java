package com.generation.greenpowerhub.model;

	import java.time.LocalDateTime;

	import org.hibernate.annotations.UpdateTimestamp;

	import jakarta.persistence.Entity;
	import jakarta.persistence.GeneratedValue;
	import jakarta.persistence.GenerationType;
	import jakarta.persistence.Id;
	import jakarta.persistence.Table;
	import jakarta.validation.constraints.NotBlank;
	import jakarta.validation.constraints.Size;

	@Entity
	@Table(name="tb_postagens")
	public class Postagem {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		
		@NotBlank(message = "Este atributo é de preenchimento obrigatório")
		@Size(min = 5, max = 100,message="Este atributo tem que ter no mínimo 5 caracteres e no máximo 100 caracteres")
		private String titulo;
		
		@NotBlank(message = "Este atributo é de preenchimento obrigatório")
		@Size(min = 10, max = 1000,message="Este atributo tem que ter no mínimo 10 caracteres e no máximo 1000 caracteres")
		private String postagem;
		
		@UpdateTimestamp
		private LocalDateTime data;
		
		@NotBlank(message = "Este atributo é de preenchimento obrigatório")
		@Size(min = 10, max = 500,message="Este atributo tem que ter no mínimo 10 caracteres e no máximo 500 caracteres")
		private String comentario;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getTitulo() {
			return titulo;
		}

		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}

		public String getPostagem() {
			return postagem;
		}

		public void setPostagem(String postagem) {
			this.postagem = postagem;
		}

		public LocalDateTime getData() {
			return data;
		}

		public void setData(LocalDateTime data) {
			this.data = data;
		}

		public String getComentario() {
			return comentario;
		}

		public void setComentario(String comentario) {
			this.comentario = comentario;
		}
		
		

}
