(ns pinterest-rest-api.specs.user-single-asset-binding
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.business-access-user-summary :refer :all]
            )
  (:import (java.io File)))


(def user-single-asset-binding-data
  {
   (ds/opt :permissions) (s/coll-of string?)
   (ds/opt :user) business-access-user-summary-spec
   })

(def user-single-asset-binding-spec
  (ds/spec
    {:name ::user-single-asset-binding
     :spec user-single-asset-binding-data}))
