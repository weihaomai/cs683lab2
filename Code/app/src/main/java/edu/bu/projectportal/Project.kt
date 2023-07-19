package edu.bu.projectportal

data class Project(val id: Int, var title: String, var description: String){
    companion object {
        val project = Project(0, "Find burger", "Authors of the project:weihao Mai\nProject links:https://github.com/CS683/project-weihaomai\nKeywords:Hamburger,burger shop\nYour favorite project? ")
    }


}