class MainQueue:
    def queueExample(self):
        queue = []
        queue.append("Java")
        queue.append("DotNet")
        queue.append("PHP")
        queue.append("HTML")
        print("pop: ", queue.pop(0))
        print("peek: ", queue[0])
        print("pop: ", queue.pop(0))
        print("peek: ", queue[0])


if _name_ == "_main_":
    MainQueue().queueExample()