import java.util.ArrayList;
import java.util.List;

public class TodoServiceImpl {
        // Creating a reference of
        // TodoService interface
        private TodoService todoService;

        // Constructor
        public TodoServiceImpl(TodoService todoService) {
            //Setting upp the service
            this.todoService = todoService;
        }

        public List<String> retrieveTodosRelatedToJava(String user){
            List<String> filteredTodos = new ArrayList<>();
            List<String> todos = todoService.retrieveTodos(user);

            for (String todo: todos){
                if (todo.contains("Java")){
                    filteredTodos.add(todo);
                }
            }
            return filteredTodos;

        }
}


