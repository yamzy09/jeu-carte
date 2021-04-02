package com.atexo.jeucarte.dtos;

import com.atexo.jeucarte.model.Carte;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface CarteMapper {
    CarteMapper INSTANCE = Mappers.getMapper( CarteMapper.class );
    CarteDto carteToCarDto(Carte carte);
    List<CarteDto> map(List<Carte> cartes);
}
