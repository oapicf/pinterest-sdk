(ns pinterest-rest-api.specs.shared-audience-common
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.operation-type :refer :all]
            )
  (:import (java.io File)))


(def shared-audience-common-data
  {
   (ds/opt :audience_id) string?
   (ds/opt :operation_type) operation-type-spec
   })

(def shared-audience-common-spec
  (ds/spec
    {:name ::shared-audience-common
     :spec shared-audience-common-data}))
