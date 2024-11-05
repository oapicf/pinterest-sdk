(ns pinterest-rest-api.specs.update-member-assets-results-response-array
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.update-member-assets-results-response-array-items-inner :refer :all]
            )
  (:import (java.io File)))


(def update-member-assets-results-response-array-data
  {
   (ds/opt :items) (s/coll-of update-member-assets-results-response-array-items-inner-spec)
   })

(def update-member-assets-results-response-array-spec
  (ds/spec
    {:name ::update-member-assets-results-response-array
     :spec update-member-assets-results-response-array-data}))
