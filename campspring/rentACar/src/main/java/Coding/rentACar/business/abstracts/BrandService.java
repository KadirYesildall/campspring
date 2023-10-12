package Coding.rentACar.business.abstracts;

import java.util.List;

import Coding.rentACar.business.requests.CreateBrandRequest;
import Coding.rentACar.business.responses.GetAllBrandsResponse;

public interface BrandService {
    List<GetAllBrandsResponse> getAll();

    void add(CreateBrandRequest createBrandRequest);
}
