export $(grep -v '^#' .env | xargs)
printenv
