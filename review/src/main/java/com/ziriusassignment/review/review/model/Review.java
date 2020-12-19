package com.ziriusassignment.review.review.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.CreatedDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Review {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  private Long id;

  @Min(value = 1, message = "Rating must be 1-5 scale")
  @Max(value = 5, message = "Rating must be 1-5 scale")
  @NotNull(message = "rate is required field")
  private Integer rate;

  private String comment;

  @ManyToOne
  private ReviewGroup reviewGroup;
  
  @CreatedDate
  private Date createdAt;

}
