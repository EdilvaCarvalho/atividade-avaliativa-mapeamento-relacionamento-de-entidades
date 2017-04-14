
package br.edu.ifpb.dac.sistemaBancario.entidades;

import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDate;
import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

/**
 *
 * @author Edilva
 */
@Converter(autoApply = true)
public class ConvertLocalDate implements AttributeConverter<LocalDate, String>, Serializable{

    @Override
    public String convertToDatabaseColumn(LocalDate attribute) {
        if(attribute == null){
            return null;
        }
        return attribute.toString();
    }

    @Override
    public LocalDate convertToEntityAttribute(String bdData) {
        if(bdData == null){
            return null;
        }
        return LocalDate.parse(bdData);
    }
    
}
