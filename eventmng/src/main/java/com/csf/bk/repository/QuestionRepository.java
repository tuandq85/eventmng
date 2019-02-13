/**
 * 
 */
package com.csf.bk.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.csf.bk.entity.Question;

/**
 * @author tuandq
 *
 */
@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {

}
