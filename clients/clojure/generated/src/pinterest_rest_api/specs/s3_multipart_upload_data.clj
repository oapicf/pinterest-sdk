(ns pinterest-rest-api.specs.s3-multipart-upload-data
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.s3-file-part :refer :all]
            )
  (:import (java.io File)))


(def s3-multipart-upload-data-data
  {
   (ds/opt :file_parts) (s/coll-of s3-file-part-spec)
   })

(def s3-multipart-upload-data-spec
  (ds/spec
    {:name ::s3-multipart-upload-data
     :spec s3-multipart-upload-data-data}))
