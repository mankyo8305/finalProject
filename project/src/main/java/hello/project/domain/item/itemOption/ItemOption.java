package hello.project.domain.item.itemOption;

import lombok.Data;

@Data
public class ItemOption {
    private Long id;
    private Long itemId;
    private String name;
    private Long price;
    private Long quantity;

    public ItemOption() {
    }

    public ItemOption(Long itemId, String name, Long price, Long quantity) {
        this.itemId = itemId;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
}
