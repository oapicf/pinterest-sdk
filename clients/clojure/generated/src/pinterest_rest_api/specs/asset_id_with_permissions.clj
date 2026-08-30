(ns pinterest-rest-api.specs.asset-id-with-permissions
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def asset-id-with-permissions-data
  {
   (ds/opt :id) string?
   (ds/opt :permissions) (s/coll-of string?)
   })

(def asset-id-with-permissions-spec
  (ds/spec
    {:name ::asset-id-with-permissions
     :spec asset-id-with-permissions-data}))
