(ns pinterest-rest-api.specs.targeting-template-update-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.targeting-spec :refer :all]
            )
  (:import (java.io File)))


(def targeting-template-update-request-data
  {
   (ds/req :id) string?
   (ds/req :operation_type) string?
   (ds/opt :targeting_attributes) targeting-spec-spec
   })

(def targeting-template-update-request-spec
  (ds/spec
    {:name ::targeting-template-update-request
     :spec targeting-template-update-request-data}))
