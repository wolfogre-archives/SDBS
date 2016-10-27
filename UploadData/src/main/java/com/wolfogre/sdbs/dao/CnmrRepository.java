package com.wolfogre.sdbs.dao;

import com.wolfogre.sdbs.domain.CnmrEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by wolfogre on 10/27/16.
 */
public interface CnmrRepository extends MongoRepository<CnmrEntity, String> {
}
