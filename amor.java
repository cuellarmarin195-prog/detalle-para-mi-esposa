function move() {
  const btn = document.getElementById("noBtn");
  btn.style.position = "fixed";

  
  const x = Math.random() * (window.innerWidth - 100);
  const y = Math.random() * (window.innerHeight - 50);

  btn.style.left = x + "px";
  btn.style.top = y + "px";
}

function showYes() {
  document.getElementById("success").style.display = "flex";
}
