
package br.edu.ifpb.dac.oficina.entidades;

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
public class ConvertLocalDate implements AttributeConverter<LocalDate, Date>, Serializable{

    @Override
    public Date convertToDatabaseColumn(LocalDate attribute) {
        if(attribute == null){
            return null;
        }
        return Date.valueOf(attribute);
    }

    @Override
    public LocalDate convertToEntityAttribute(Date bdData) {
        if(bdData == null){
            return null;
        }
        return bdData.toLocalDate();
    }
    
}
