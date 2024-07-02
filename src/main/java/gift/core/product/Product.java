package gift.core.product;

public record Product(
        Long id,
        String name,
        Integer price,
        String imageUrl
) {
}