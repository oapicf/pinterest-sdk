(ns pinterest-rest-api.specs.customer-list-upload-create-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.customer-list-upload :refer :all]
            [pinterest-rest-api.specs.s3-multipart-upload-data :refer :all]
            )
  (:import (java.io File)))


(def customer-list-upload-create-response-data
  {
   (ds/req :customer_list_upload) customer-list-upload-spec
   (ds/req :s3_multipart_upload_data) s3-multipart-upload-data-spec
   })

(def customer-list-upload-create-response-spec
  (ds/spec
    {:name ::customer-list-upload-create-response
     :spec customer-list-upload-create-response-data}))
