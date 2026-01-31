(ns pinterest-rest-api.specs.s3-file-part
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def s3-file-part-data
  {
   (ds/req :part_number) int?
   (ds/req :presigned_url) string?
   })

(def s3-file-part-spec
  (ds/spec
    {:name ::s3-file-part
     :spec s3-file-part-data}))
