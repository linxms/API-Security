package org.example.apisecurity.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.example.apisecurity.entity.Student;

@Mapper
public interface StudentMapper extends BaseMapper<Student> {
}
