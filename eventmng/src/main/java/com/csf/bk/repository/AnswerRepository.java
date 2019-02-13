/**
 * 
 */
package com.csf.bk.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.csf.bk.entity.Answer;

/**
 * @author tuandq
 *
 */
@Repository
public interface AnswerRepository extends JpaRepository<Answer, Long> {
	List<Answer> findByQuestionId(Long questionId);
}
