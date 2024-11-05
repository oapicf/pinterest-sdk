(ns pinterest-rest-api.specs.update-member-assets-results-response-array-items-inner
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.users-for-individual-asset-response :refer :all]
            )
  (:import (java.io File)))


(def update-member-assets-results-response-array-items-inner-data
  {
   (ds/opt :response) users-for-individual-asset-response-spec
   })

(def update-member-assets-results-response-array-items-inner-spec
  (ds/spec
    {:name ::update-member-assets-results-response-array-items-inner
     :spec update-member-assets-results-response-array-items-inner-data}))
