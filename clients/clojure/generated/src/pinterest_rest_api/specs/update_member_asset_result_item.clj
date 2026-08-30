(ns pinterest-rest-api.specs.update-member-asset-result-item
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.users-for-individual-asset-response :refer :all]
            )
  (:import (java.io File)))


(def update-member-asset-result-item-data
  {
   (ds/opt :response) users-for-individual-asset-response-spec
   })

(def update-member-asset-result-item-spec
  (ds/spec
    {:name ::update-member-asset-result-item
     :spec update-member-asset-result-item-data}))
