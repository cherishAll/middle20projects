package cn.edu.ustb.dm.dao;

import cn.edu.ustb.dm.model.BookInfo;
import cn.edu.ustb.dm.model.BookInfoExample;
import cn.edu.ustb.dm.model.BookInfoWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BookInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_info
     *
     * @mbggenerated Sun May 19 11:22:56 CST 2013
     */
    int countByExample(BookInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_info
     *
     * @mbggenerated Sun May 19 11:22:56 CST 2013
     */
    int deleteByExample(BookInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_info
     *
     * @mbggenerated Sun May 19 11:22:56 CST 2013
     */
    int deleteByPrimaryKey(Integer BOOK_ID);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_info
     *
     * @mbggenerated Sun May 19 11:22:56 CST 2013
     */
    int insert(BookInfoWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_info
     *
     * @mbggenerated Sun May 19 11:22:56 CST 2013
     */
    int insertSelective(BookInfoWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_info
     *
     * @mbggenerated Sun May 19 11:22:56 CST 2013
     */
    List<BookInfoWithBLOBs> selectByExampleWithBLOBs(BookInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_info
     *
     * @mbggenerated Sun May 19 11:22:56 CST 2013
     */
    List<BookInfo> selectByExample(BookInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_info
     *
     * @mbggenerated Sun May 19 11:22:56 CST 2013
     */
    BookInfoWithBLOBs selectByPrimaryKey(Integer BOOK_ID);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_info
     *
     * @mbggenerated Sun May 19 11:22:56 CST 2013
     */
    int updateByExampleSelective(@Param("record") BookInfoWithBLOBs record, @Param("example") BookInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_info
     *
     * @mbggenerated Sun May 19 11:22:56 CST 2013
     */
    int updateByExampleWithBLOBs(@Param("record") BookInfoWithBLOBs record, @Param("example") BookInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_info
     *
     * @mbggenerated Sun May 19 11:22:56 CST 2013
     */
    int updateByExample(@Param("record") BookInfo record, @Param("example") BookInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_info
     *
     * @mbggenerated Sun May 19 11:22:56 CST 2013
     */
    int updateByPrimaryKeySelective(BookInfoWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_info
     *
     * @mbggenerated Sun May 19 11:22:56 CST 2013
     */
    int updateByPrimaryKeyWithBLOBs(BookInfoWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_info
     *
     * @mbggenerated Sun May 19 11:22:56 CST 2013
     */
    int updateByPrimaryKey(BookInfo record);
}