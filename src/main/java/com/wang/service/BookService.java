package com.wang.service;

import com.wang.domain.Book;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Wang
 */


@Transactional
public interface BookService {

    /**
     * 保存
     * @param book
     * @return
     */
    public boolean save(Book book);

    /**
     * 修改
     * @param book
     * @return
     */
    public boolean update(Book book);

    /**
     * 根据id删除
     * @param id
     * @return
     */
    public boolean delete(Integer id);

    /**
     * 根据id查找
     * @param id
     * @return
     */
    public Book getById(Integer id);

    /**
     * 查找全部
     *
     * @return
     */
    public List<Book> getAll();
}
