(ns pinterest-rest-api.specs.invite-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def invite-status-data
  {
   })

(def invite-status-spec
  (ds/spec
    {:name ::invite-status
     :spec invite-status-data}))
