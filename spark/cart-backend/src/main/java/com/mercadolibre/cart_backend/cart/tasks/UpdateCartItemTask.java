package com.mercadolibre.cart_backend.cart.tasks;

import com.mercadolibre.cart_backend.cart.entities.CartItem;
import com.mercadolibre.cart_backend.core.TaskBase;
import com.mercadolibre.cart_backend.core.entities.VoidEntity;

import java.util.Map;

/**
 * Created by fvitali on 8/8/16.
 */
public class UpdateCartItemTask extends TaskBase<VoidEntity> {
	@Override
	public VoidEntity execute(Map<String, Object> params) {
		super.execute(params);

		String cartId = (String) params.get("cartId");
		String item = (String) params.get("itemId");
		CartItem cartItem = (CartItem) params.get("cartItem"); // TODO: validate

		return null;
	}
}
