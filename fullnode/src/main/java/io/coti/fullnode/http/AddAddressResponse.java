package io.coti.fullnode.http;

import io.coti.basenode.data.Hash;
import io.coti.basenode.http.BaseResponse;
import io.coti.basenode.http.data.AddressStatus;

public class AddAddressResponse extends BaseResponse {


    public String address;
    public AddressStatus addressStatus;


    public AddAddressResponse(Hash addressHash, AddressStatus status) {
        this(addressHash.toHexString(), status);
    }

    public AddAddressResponse(String address, AddressStatus status) {

        this.address = address;
        this.addressStatus = status;

    }


}
