(ns pinterest-rest-api.specs.update-asset-group-response-exceptions-inner
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def update-asset-group-response-exceptions-inner-data
  {
   (ds/opt :code) int?
   (ds/opt :message) string?
   (ds/opt :asset_group_id) string?
   })

(def update-asset-group-response-exceptions-inner-spec
  (ds/spec
    {:name ::update-asset-group-response-exceptions-inner
     :spec update-asset-group-response-exceptions-inner-data}))
