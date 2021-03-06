package com.ensa.SmartSchoolServer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ensa.SmartSchoolServer.dao.LevelDao;
import com.ensa.SmartSchoolServer.entity.Level;
import com.ensa.SmartSchoolServer.entity.Professor;
import com.ensa.SmartSchoolServer.entity.Module;

@Component
public class LevelService {

	private LevelDao levelDao;
@Autowired
	public LevelService(LevelDao levelDao) {
		super();
		this.levelDao = levelDao;
	}

	public List<Level> getLevels() {
		return this.levelDao.getLevels();
	}
	public List<Module> getModules(String levelName) {
		return this.levelDao.getModules(levelName);
	}
	
	public List<Professor> getProfessors(String levelName) {
		return this.levelDao.getProfessors(levelName);
	}

	public Level getLevel(String name) {
		return this.levelDao.getLevel(name);
	}
	public boolean create(Level level) {
		return levelDao.create(level);
	}

	public boolean updateLevelName(Level level, String name) {
		return levelDao.updateLevelName(level,name);
	}
	
	public boolean delete(Level level) {
		return levelDao.delete(level);
	}


}