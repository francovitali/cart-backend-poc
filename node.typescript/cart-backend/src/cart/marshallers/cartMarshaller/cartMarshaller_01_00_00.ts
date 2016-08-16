import Marshaller from '../../../core/contracts/marshaller';
import Cart from '../../entities/cart/cart_01_00_00';

export default class CartMarshaller_01_00_00 implements Marshaller<Cart> {
    public getJson(entity: Cart): any {
        entity.note += ' (modified with CartMarshaller_01_00_00)';
        entity.marshaller = 'CartMarshaller_01_00_00';
        return entity;
    }
}