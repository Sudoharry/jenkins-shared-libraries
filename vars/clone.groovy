def call(String url, String branch) {
  echo "This is for cloning the code"
  git url: "${url}", branch: "${branch}"
  echo "Code cloning successfully"
}
