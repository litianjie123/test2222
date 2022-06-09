package com.example.demo.responsevo;


import io.swagger.annotations.ApiModel;
import lombok.Data;


@Data
@ApiModel(value = "ApiResponse", description = "公共响应")
public class ApiPagingResponse<T> extends ApiResponse<T> {
    private Paging paging;


    public static <T> ApiPagingResponse<T> buildSuccessWithPaging(T data, Paging paging) {
        ApiPagingResponse<T> response = new ApiPagingResponse<>();
        response.setCode(200);
        response.setSuccess(true);
        response.setMessage("");
        response.setData(data);
        response.setPaging(paging);
        return response;
    }


    @Data
    public static class Paging {
        private long pageNo;
        private long limit;
        private long total;
        private boolean hasMore;
        public boolean getHasMore(int rows) {
            long displayRows = Math.addExact(rows, Math.multiplyExact((this.pageNo - 1), this.limit));
            return displayRows < this.total;
        }
        @Override
        public String toString() {
            return "Page{" +
                    "pageNo=" + pageNo +
                    ", limit=" + limit +
                    ", total=" + total +
                    ", hasMore=" + hasMore +
                    '}';
        }
    }

}

