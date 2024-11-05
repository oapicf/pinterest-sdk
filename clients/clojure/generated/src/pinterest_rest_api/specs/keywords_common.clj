(ns pinterest-rest-api.specs.keywords-common
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.match-type-response :refer :all]
            )
  (:import (java.io File)))


(def keywords-common-data
  {
   (ds/opt :bid) int?
   (ds/req :match_type) match-type-response-spec
   (ds/req :value) string?
   })

(def keywords-common-spec
  (ds/spec
    {:name ::keywords-common
     :spec keywords-common-data}))
