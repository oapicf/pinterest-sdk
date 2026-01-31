(ns pinterest-rest-api.specs.delete-asset-group-response-exceptions-inner
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def delete-asset-group-response-exceptions-inner-data
  {
   (ds/opt :asset_group_id) string?
   (ds/opt :code) int?
   (ds/opt :message) string?
   })

(def delete-asset-group-response-exceptions-inner-spec
  (ds/spec
    {:name ::delete-asset-group-response-exceptions-inner
     :spec delete-asset-group-response-exceptions-inner-data}))
