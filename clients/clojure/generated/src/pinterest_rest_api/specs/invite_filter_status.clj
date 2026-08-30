(ns pinterest-rest-api.specs.invite-filter-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def invite-filter-status-data
  {
   })

(def invite-filter-status-spec
  (ds/spec
    {:name ::invite-filter-status
     :spec invite-filter-status-data}))
