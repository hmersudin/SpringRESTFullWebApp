package com.lilium.converter;

import com.lilium.dto.BaseDTO;
import com.lilium.entity.DistributedEntity;

/**
 * Abstract converter used to convert from ENTITY to DTO.
 *
 * @param <ENTITY> Entity to convert.
 * @param <DTO> DTO in which we are converting.
 */
public abstract class AbstractDTOConverter<ENTITY extends DistributedEntity, DTO extends BaseDTO> {

    /**
     * Converts forwarded entity to forwarded DTO.
     *
     * @param entity Entity to convert.
     * @param dto DTO in which we are converting.
     */
    public void convert(final ENTITY entity, final DTO dto) {
        // All properties that we have on entity sets to dto
        // Fetch entity from db and covert it to dto (forwarded to the FE)
        dto.setId(entity.getId());
        dto.setCreatedTimestamp(entity.getCreatedTimestamp());
        dto.setModifiedTimestamp(entity.getModifiedTimestamp());
    }
}
