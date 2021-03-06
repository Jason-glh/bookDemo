package com.jason.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Jason
 * create 2020/9/14
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Books {

	private int bookId;
	private String bookName;
	private int bookCounts;
	private String detail;
}
