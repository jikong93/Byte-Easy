package com.mbyte.easy.admin.service.impl;

import com.mbyte.easy.admin.entity.Person;
import com.mbyte.easy.admin.mapper.PersonMapper;
import com.mbyte.easy.admin.service.IPersonService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 
 * @since 2019-04-03
 */
@Service
public class PersonServiceImpl extends ServiceImpl<PersonMapper, Person> implements IPersonService {

}
