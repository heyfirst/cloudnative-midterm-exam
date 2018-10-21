const newman = require("newman");

newman.run(
  {
    collection: require("./SIT-ECR-Collection-58130500009.postman_collection.json"),
    reporters: "cli"
  },
  function(err) {
    if (err) throw err;
    console.log("collection run complete");
  }
);
