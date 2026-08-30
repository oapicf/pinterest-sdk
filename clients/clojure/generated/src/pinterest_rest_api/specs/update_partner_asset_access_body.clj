(ns pinterest-rest-api.specs.update-partner-asset-access-body
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.update-partner-asset-access-item :refer :all]
            )
  (:import (java.io File)))


(def update-partner-asset-access-body-data
  {
   (ds/req :accesses) (s/coll-of update-partner-asset-access-item-spec)
   })

(def update-partner-asset-access-body-spec
  (ds/spec
    {:name ::update-partner-asset-access-body
     :spec update-partner-asset-access-body-data}))
