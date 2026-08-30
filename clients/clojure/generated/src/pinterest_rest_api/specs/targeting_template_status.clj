(ns pinterest-rest-api.specs.targeting-template-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def targeting-template-status-data
  {
   })

(def targeting-template-status-spec
  (ds/spec
    {:name ::targeting-template-status
     :spec targeting-template-status-data}))
