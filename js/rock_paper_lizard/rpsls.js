const rockBtn = document.getElementById('rock');
const paperBtn = document.getElementById('paper');
const scissorsBtn = document.getElementById('scissors');
const lizardBtn = document.getElementById('lizard');
const spockBtn = document.getElementById('spock');
const resultTxt = document.getElementById('result');
const playAgainBtn = document.getElementById('play-again');
const quitBtn = document.getElementById('quit');


const rules = {
  rock: ['scissors', 'lizard'],
  paper: ['rock', 'spock'],
  scissors: ['paper', 'lizard'],
  lizard: ['paper', 'spock'],
  spock: ['rock', 'scissors']
};


function getComputerMove() {
  const moves = ['rock', 'paper', 'scissors', 'lizard', 'spock'];
  const randomIndex = Math.floor(Math.random() * moves.length);
  return moves[randomIndex];
}


function getWinner(playerMove, computerMove) {
  if (playerMove === computerMove) {
    return 'tie';
  }

  if (rules[playerMove].includes(computerMove)) {
    return 'player';
  }

  return 'computer';
}


function displayResult(winner) {
  switch (winner) {
    case 'player':
      resultTxt.innerHTML = 'You win!';
      break;
    case 'computer':
      resultTxt.innerHTML = 'Computer wins!';
      break;
    case 'tie':
      resultTxt.innerHTML = 'It\'s a tie!';
      break;
  }
}


rockBtn.addEventListener('click', function() {
  const computerMove = getComputerMove();
  const winner = getWinner('rock', computerMove);
  displayResult(winner);
});

paperBtn.addEventListener('click', function() {
  const computerMove = getComputerMove();
  const winner = getWinner('paper', computerMove);
  displayResult(winner);
});

scissorsBtn.addEventListener('click', function() {
  const computerMove = getComputerMove();
  const winner = getWinner('scissors', computerMove);
  displayResult(winner);
});

lizardBtn.addEventListener('click', function() {
  const computerMove = getComputerMove();
  const winner = getWinner('lizard', computerMove);
  displayResult(winner);
});

spockBtn.addEventListener('click', function() {
  const computerMove = getComputerMove();
  const winner = getWinner('spock', computerMove);
  displayResult(winner);
});


playAgainBtn.addEventListener('click', function() {
  resultTxt.innerHTML = '';
});

quitBtn.addEventListener('click', function() {
  window.close();
});