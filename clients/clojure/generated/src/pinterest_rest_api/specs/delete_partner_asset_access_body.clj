(ns pinterest-rest-api.specs.delete-partner-asset-access-body
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.delete-partner-asset-access-body-accesses-inner :refer :all]
            )
  (:import (java.io File)))


(def delete-partner-asset-access-body-data
  {
   (ds/req :accesses) (s/coll-of delete-partner-asset-access-body-accesses-inner-spec)
   })

(def delete-partner-asset-access-body-spec
  (ds/spec
    {:name ::delete-partner-asset-access-body
     :spec delete-partner-asset-access-body-data}))
