package com.example.example

class DataManager {

    val courses = HashMap<String, CourseInfo>()
    val notes = ArrayList<NoteInfo>()

    init {
        initializeCourses()
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