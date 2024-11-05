(ns pinterest-rest-api.specs.update-member-asset-access-body
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.update-member-asset-access-body-accesses-inner :refer :all]
            )
  (:import (java.io File)))


(def update-member-asset-access-body-data
  {
   (ds/req :accesses) (s/coll-of update-member-asset-access-body-accesses-inner-spec)
   })

(def update-member-asset-access-body-spec
  (ds/spec
    {:name ::update-member-asset-access-body
     :spec update-member-asset-access-body-data}))
