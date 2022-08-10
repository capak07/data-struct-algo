class Node
    attr_accessor :value, :left, :right

    def initialize(value)
        @value = value
        @@ight = nil
        @left = nil
    end
end


class TreeNode
    attr_accessor :root, :size
    def initialize()
        @root = nil
    end

    def add(value)
        node =  Node.new(value)
        if @root == nil
            @root = node

        else
            counter = @root
            prev = counter
            while counter != nil
                if node.value < counter.value
                    prev = counter
                    counter = counter.left
                else
                    prev = counter
                    counter = counter.right
                end
            end

            if node.value < prev.value
                prev.left = node
            else
                prev.right = node
            end
        end
    end

    def print_in_order(node)
        if node.left == nil && node.right == nil
            print "#{node.value} "
            return

        else
            print "#{node.value} "
            if node.left != nil
                print_in_order(node.left)
            
            end
            if node.right != nil
                print_in_order(node.right)
            end
        end
    end

end

array = [5,12,77,34,49,1,3,0]
btree = TreeNode.new()
i = 0;
while i < array.size
    btree.add(array[i])
    i+=1
end
puts btree.print_in_order(btree.root)
