# Testing_queryjpa
 
tri
// order by 'published' column - descending, then order by 'title' - ascending

List<Tutorial> tutorials =

     tutorialRepository.findAll(Sort.by("published").descending().and(Sort.by("title")));
