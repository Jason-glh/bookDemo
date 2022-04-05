package com.jason.dao;

import com.jason.pojo.Books;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Jason
 * create 2020/9/14
 */
@Mapper
public interface BookMapper {

	/**
	 *增加一个书籍
	 * @param book
	 * @return
	 */
	int addBook(Books book);

	/**
	 *根据id删除一个书籍
	 * @param id
	 * @return
	 */
	int deleteBookById(@Param("bookId") int id);


	/**
	 *更新书籍
	 * @param books
	 * @return
	 */
	int updateBook(Books books);

	/**
	 *根据id查询,返回一个书籍
	 * @param id
	 * @return
	 */
	Books queryBookById(@Param("bookId") int id);

	/**
	 *查询全部的书籍
	 * @return
	 */
	List<Books> queryAllBook();

	/**
	 *根据书名查询书籍
	 * @param bookName
	 * @return
	 */
	Books queryBookByName(@Param("bookName") String bookName);
}
