package com.example.example

object DataManager {

    val courses = HashMap<String, CourseInfo>()
    val notes = ArrayList<NoteInfo>()

    init {
        initializeCourses()
        initializeNotes()
    }

    private fun initializeNotes() {
        var defaultCourse = CourseInfo("default", "DEFAULT")

        var noteInfo = NoteInfo(courses.getOrDefault("java_code", defaultCourse), "The default course",
            "Default note for course")
        notes.add(noteInfo)

        noteInfo = NoteInfo(courses.getOrDefault("android_async", defaultCourse), "Parameters",
            "Leverage variable-length parameters")
        notes.add(noteInfo)
    }

    private fun initializeCourses() {
        var course = CourseInfo("android_intents", "Android Programming with Intents")
        courses.set(course.courseId, course)

        course = CourseInfo(courseId = "android_async", title = "Android Async Programming and Services")
        courses.set(course.courseId, course)

        course = CourseInfo(title = "Java Fundamentals: the Java Language", courseId = "java_lang")
        courses.set(course.courseId, course)

        course = CourseInfo("java_code", "Java Fundamentals: The Core Platform")
        courses.set(course.courseId, course)

    }

}