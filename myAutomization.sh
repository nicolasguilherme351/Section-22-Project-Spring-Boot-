git config --global user.email "nicolasrenovado12@example.com"
git config --global user.name "Nicolas"
git add . 
echo "digit your commit: "
read name
git commit -m "$name"
git push
