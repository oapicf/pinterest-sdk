(ns pinterest-rest-api.specs.targeting-template-update-request-read-or-update
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.audience-update-operation-type :refer :all]
            [pinterest-rest-api.specs.targeting-spec-optimal :refer :all]
            )
  (:import (java.io File)))


(def targeting-template-update-request-read-or-update-data
  {
   (ds/req :id) string?
   (ds/req :operation_type) audience-update-operation-type-spec
   (ds/opt :targeting_attributes) targeting-spec-optimal-spec
   })

(def targeting-template-update-request-read-or-update-spec
  (ds/spec
    {:name ::targeting-template-update-request-read-or-update
     :spec targeting-template-update-request-read-or-update-data}))
