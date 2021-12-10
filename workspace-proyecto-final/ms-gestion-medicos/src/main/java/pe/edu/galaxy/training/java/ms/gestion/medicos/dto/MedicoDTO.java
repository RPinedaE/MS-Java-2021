package pe.edu.galaxy.training.java.ms.gestion.medicos.dto;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper=true)
@JsonPropertyOrder(value = {"id","nombres","apellidos","cmp"})
public class MedicoDTO extends GenericDTO{
	
    private Long id;    
    private String nombres;	
	private String apellidos;
	private String cmp;
}
